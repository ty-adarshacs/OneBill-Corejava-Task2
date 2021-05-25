package com.onebill.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.onebill.bean.Product;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;

public class MainProduct {
	public static void main(String[] args) {
		int count = 0;
		int rcount = 0;
		String columnname = null;
		String columnname1 = null;
		String columnname2 = null;
		String columnname3 = null;
		String columnname4 = null;
		String columnname5 = null;
		try {
			FileReader file = new FileReader("D:\\\\product2.csv");
			BufferedReader product = new BufferedReader(file);
			String row = "";

			while ((row = product.readLine()) != null) {
				String[] cols = row.split(","); // array of string
				columnname = cols[0];
				columnname1 = cols[1];
				columnname2 = cols[2];
				columnname3 = cols[3];

				if (rcount == 1) {
					System.out.println(columnname);
					System.out.println(columnname1);
					System.out.println(columnname2);
					System.out.println(columnname3);
					rcount++;
				}
				rcount++;

				// System.out.println( columnname);
//                System.out.println(cols);
//
				if (columnname.equalsIgnoreCase("Stream Dynamics")) {
					// System.out.println("readding");
					count++;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Stream Dyamic name repeted :" + count);

		System.out.println(
				"----------------------------------------------------------------------------------------------");
		Map<String, String> mapping = new HashMap<String, String>();
		// Hashmap to map CSV data to

		mapping.put("product_Name", "Product_Name"); // Bean attributes.
		mapping.put("product_Code", "Product_Code");
		mapping.put("product_Description", "Product_Description");
		mapping.put("price_Plan_Name", "Price_Plan_Name");
		mapping.put("price_Plan_Code", "Price_Plan_Code");
		mapping.put("price_Plan_Description", "Price_Plan_Description");
		mapping.put("onetime_Fee", "Onetime_Fee");
		mapping.put("recurring_Fee", "Recurring_Fee");

		HeaderColumnNameTranslateMappingStrategy<Product> strategy = new HeaderColumnNameTranslateMappingStrategy<Product>();
		strategy.setType(Product.class);
		strategy.setColumnMapping(mapping);

		CSVReader csvReader = null;
		try {
			csvReader = new CSVReader(new FileReader("D:\\product2.csv"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		CsvToBean csvToBean = new CsvToBean(); // to store data
		List<Product> list = csvToBean.parse(strategy, csvReader);

		for (Product e : list) {
			// System.out.println(e.toString());
			System.out.println(e.getPrice_Plan_Name());
//			
			System.out.println(e.getOnetime_Fee() + " ");
			System.out.println(e.getPrice_Plan_Description());
			System.out.println();

		}
		System.out.println("=====================================================");

	}

}
