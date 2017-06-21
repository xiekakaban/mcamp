import requests
from selenium import webdriver
from selenium.webdriver.common.desired_capabilities import DesiredCapabilities
from bs4 import BeautifulSoup
import json
def storeImage(imgTagList):
    return imgTagList['src']

def storePic(picTagList):
    return (picTagList['data-imgs'])

import time
dcap = dict(DesiredCapabilities.PHANTOMJS)  #设置userAgent
dcap["phantomjs.page.settings.userAgent"] = ("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36")
dcap["phantomjs.page.settings.accept"] = ("text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8")
dcap["phantomjs.page.settings.accept-encoding"] = ("gzip,deflate,sdch,br")
dcap["accept-language"]=("en-US,en;q=0.8,zh-CN;q=0.6,zh;q=0.4")
dcap["referer"]=("https://detail.1688.com/offer/544928091945.html?spm=a2604.8446800.iwlwdfal.10.fZcanl")
#browser = webdriver.PhantomJS(executable_path=r'D:\Software\phantomjs-2.1.1-windows\bin\phantomjs.exe',desired_capabilities=dcap) #加载网址
browser = webdriver.Chrome(executable_path=r'D:\Software\chromedriver.exe') #加载网址
#browser = webdriver.Firefox(executable_path=r'D:\Software\geckodriver.exe')
browser.set_page_load_timeout(100)
try:
    browser.get("https://detail.1688.com/offer/527609190136.html?spm=a2615.2177701.0.0.vAGM9J")
    browser.execute_script("var q=document.body.scrollTop=100000")
    time.sleep(5)
    #lazyloadDiv = browser.find_element_by_id("desc-lazyload-container")
    soup = BeautifulSoup(browser.page_source,'html.parser')
    title = browser.title
    fetchImages = soup.select("div[id=desc-lazyload-container] img['style=visibility: visible; zoom: 1;']")
    picImage = soup.select("div#dt-tab li.tab-trigger");
    print("title: %s"%title[0:-7]);

    imageList = [item['src'] for item in fetchImages]
    picListTemp = [item['data-imgs'] for item in picImage]
    picList = []
    for p in picListTemp:
        pjson = json.loads(p)
        picList.append(pjson.get('preview'))

    print(imageList)
    print("\n")
    print(picList)

except Exception as e:
    print(e)
#browser.close()
