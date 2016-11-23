#!/usr/bin/env python
# -*- coding: utf-8 -*-

import argparse
from kanyun import KanYun
import urllib
import urllib.request
from CommonUtil import getContentFromPath
from bs4 import BeautifulSoup
import os
import re


# 启用Proxy

def getItems(start, end):
    for i in range(start, end, 1):
        KanyunList = {}
        soup = BeautifulSoup(getContentFromPath('http://www.kancloud.cn/explore?page=' + str(i)), 'html.parser')
        itemList = soup.select('div.m-manual-list div.list-item')
        for item in itemList:
            title = item.find('a', class_='name').text
            image = item.find('img', class_='cover b-cover')['src']
            view = item.find('b', class_='data-number').text
            KanyunList[title] = KanYun(title, image, view)
    return KanyunList


def getMaxPath():
    soup = BeautifulSoup(getContentFromPath('http://www.kancloud.cn/explore'), 'html.parser')
    tag = soup.select("div.m-paging a.end")[0]
    return int(tag.text)
    r'''
        value = {"username":"1016903103@qq.com","password":"XXXX"}
        data = urllib.urlencode(values);
        user_agent = 'Mozilla/4.0 (compatible; MSIE 5.5; Windows NT)'
        headers = { 'User-Agent' : user_agent }
        reqeust = urllib2.Request("https://www.kancloud.cn/explore",data,headers)
        httpHandler = urllib2.HTTPHandler(debuglevel=1)
        httpsHandler = urllib2.HTTPSHandler(debuglevel=1)
        opener = urllib2.build_opener(httpHandler, httpsHandler)
        urllib2.install_opener(opener)
    '''


def saveImage(savePath, imageurl,fileName,fileType):
    imgData = getContentFromPath(imageurl)
    f = open(savePath+'\\'+fileName,'wb')
    f.write(imgData)
    f.close()

if __name__ == '__main__':
    SAVEPATH = os.getcwd()+'\\images';
    print(SAVEPATH)
    MAXPAGE = getMaxPath();
    start = 0;
    end = MAXPAGE;
    parser = argparse.ArgumentParser();
    parser.add_argument("-s", "--start", type=int, help="Enter start page number")
    parser.add_argument("-e", "--end", type=int, help="Enter the end page number")
    parser.add_argument("-p", "--savepath", help="Which Do you wanto save")
    args = parser.parse_args()
    # You wanto give page
    if args.start != None:
        if args.start > 0 and args.start < MAXPAGE:
            start = args.start
    if args.end != None:
        if args.end < MAXPAGE and args.end > 0:
            end = args.end
    if args.savepath!=None:
        SAVEPATH = args.savepath
    if not (os.path.isdir(SAVEPATH)):
        os.makedirs(SAVEPATH)

KanyunList = getItems(start, end)
pattern = re.compile(r'.*\^[jpg]*\?')
