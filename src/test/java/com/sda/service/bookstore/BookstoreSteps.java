package com.sda.service.bookstore;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class BookstoreSteps {
    private List<Book> books;
    private Bookstore bookstore;
    private Book book;




    @Given("^I instantiate bookstore$")
    public void I_instantiate_bookstore(){
        this.bookstore = new Bookstore();
    }

    @And("^I create a book$")
    public void I_create_a_book(){
        this.book = new Book("Krzyżacy", 354,"Sienkiewicz", "vdvsdfv435234s" );
    }

    @When("^I add book to bookstore$")
    public void I_add_book_to_bookstore(){
        this.bookstore.add(this.book);
    }

    @Then("^Book is present in bookstore$")
    public void Book_is_present_in_bookstore(){
        Assert.assertEquals(1, this.bookstore.getBooks().size());
    }

    @And("^I edit title of book$")
    public void I_edit_title_of_book(){
        this.bookstore.updateTitle(book,"Quo vadis");
    }

    @Then("^Book's title has changed$")
    public void Books_title_has_changed(){
        Assert.assertEquals("Quo vadis", this.bookstore.getBooks().get(0).getTitle());
    }

}
