package com.turnright.createTable;

import java.util.EnumSet;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

public class CreateTables {

	@Test
	/**创建数据表 if exist drop*/
	public void miguration(){
		Configuration configuration = new Configuration().configure();
		SchemaExport schemaExport = new SchemaExport(configuration);
		//在Consloe输出，在数据库中添加
		schemaExport.create(true,true);
	}
}
