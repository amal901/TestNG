package com.todos.tests;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.test.todos.pages.ToDoPage;
import com.test.todos.utils.Setup;

public class AddToDoTest extends Setup {

	public AddToDoTest() throws IOException {
		super();
	}
	
	ToDoPage toDoPage;
	
	@Test 
	public void iCanAddTodo() throws IOException {
		
		toDoPage = new ToDoPage();
		
		//Check if todo field is displayed
		boolean result = toDoPage.isElementDisplayed(ToDoPage.inputText);
		Assert.assertTrue(result);
		//Assert.assertEquals("true", result);
		
		toDoPage.fillToDo(prop.getProperty("todo1"));
		String txtToDo = toDoPage.checkFieldContains(ToDoPage.textToDo);
		Assert.assertTrue(txtToDo.contains(prop.getProperty("todo1")));
		boolean result1 = toDoPage.isCheckBoxSelected(ToDoPage.checkBox);
		Assert.assertFalse(result1);
	}

}
