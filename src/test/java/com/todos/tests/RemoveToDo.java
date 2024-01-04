	package com.todos.tests;

import java.io.IOException;

import org.junit.Assert;

import com.test.todos.pages.ToDoPage;
import com.test.todos.utils.Setup;

public class RemoveToDo  extends Setup {
	
	public RemoveToDo() throws IOException {
		super();
	}
	
	ToDoPage toDoPage;
	
	public void iCanRemoveTodo() throws IOException {
		
		toDoPage = new ToDoPage();
		toDoPage.fillToDo(prop.getProperty("todo1"));
		toDoPage.clickOnElement(ToDoPage.checkBox);
		toDoPage.clickOnElement(ToDoPage.btnRemove);
		String pageSource = toDoPage.checkTextOnPageSource();
		Assert.assertFalse(pageSource.contains(prop.getProperty("todo1")));
	}
	

}
