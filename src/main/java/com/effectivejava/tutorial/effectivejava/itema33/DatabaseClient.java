package com.effectivejava.tutorial.effectivejava.itema33;

public class DatabaseClient {

	// Client
	public static void main(String[] args) 
	{
		Column<Integer> integerColumn = new Column<Integer>(Integer.class);
		Column<String> stringColumn = new Column<String>(String.class);
		Column<String> stringColumn2 = new Column<String>(String.class);

		DatabaseRow databaseRow = new DatabaseRow();
		databaseRow.putColumn(integerColumn, 3);
		databaseRow.putColumn(stringColumn, "3");
		databaseRow.putColumn(stringColumn2, "4");

		System.out.println("The integer + 1: " + (databaseRow.getColumn(integerColumn) + 1));
		System.out.println("The string: " + databaseRow.getColumn(stringColumn));
		System.out.println("The String2: " + databaseRow.getColumn(stringColumn2));
		
	}
}