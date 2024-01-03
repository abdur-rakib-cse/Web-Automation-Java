package HomePage;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

@Getter
WebDriver driver;

By shohoz_logo = By.xpath("//a[@href='https://www.shohoz.com/en']//img[@alt='Shohoz']");
By Bus_button = By.xpath("//a[@title='Bus']");

By Launch_Button = By.xpath("//a[@title='Bus']");

By Train_Button = By.xpath("//a[@title='Train']");

By Event_Button = By.xpath("//a[@title='Train']");

By Language= By.xpath("//div[@class='placeholder']");

By Contact_us = By.xpath("//a[@title='Contact Us']");

By Input_field = By.xpath("//input[@id='dest_from']");

By To_Input_field = By.xpath("//input[@id='dest_to']");

By Date_of_Journey_input =By.xpath("//input[@id='doj']");

By Date_of_Return_input =By.xpath("//input[@id='dor']");
By Search_Buses_Button =By.xpath("//button[normalize-space()='Search Buses']");
By Selected_Date = By.xpath("//a[normalize-space()='18']");

By Departure_Text = By.xpath("//p[@class='ticket_text active-text']");
By Return_Text = By.xpath("//p[@class='ticket_text xs-hidden']");
By pre_Day = By.xpath("//button[normalize-space()='Prev. Day']");
By Next_Day =By.xpath("//button[normalize-space()='Next Day']");

By Add_Return_Ticket = By.xpath("//button[@class='xs-hidden return_button xs-return_button']");
By Modify_Search_Button = By.xpath("//button[@class='modify_search mod_search']");

By Operator_Bus_Type = By.xpath("//button[@class='modify_search mod_search']");

By View_Seats = By.xpath("//button[@id='11816807']//div[@class='view-seats-spinner']");

By Choose_your_seats = By.xpath("//h4[@id='H1']");

By Available_seats=By.xpath("//li[normalize-space()='Available Seats']");
By Booked_Seats = By.xpath("//li[normalize-space()='Booked Seats']");
By Selected_Seats = By.xpath("//li[@class='seat-green']");

By Hidden_sits = By.xpath("//a[normalize-space()='0-1-3']");
By Total= By.xpath("//b[normalize-space()='Total: 700']");

By Choose_Boarding_Point =By.xpath("//label[@for='bpt']");

By Boarding_points= By.xpath("Choose_Boarding_Point");

By Continue_sits = By.xpath("//a[@class='btn btn-default btn-sm continue-btn']");


public Homepage(WebDriver driver){
    this.driver = driver ;
}


public WebElement shohoz_logo(){
    return driver.findElement(shohoz_logo);
    }

public WebElement Bus_button(){
    return driver.findElement(Bus_button);
    }

public WebElement Launch_Button(){
    return driver.findElement(Launch_Button);
    }
    public WebElement Train_Button(){
    return driver.findElement(Train_Button);
    }
    public WebElement Event_Button(){
    return driver.findElement(Event_Button);
    }

    public WebElement Language(){
    return driver.findElement(Language);
    }

    public WebElement Contact_us(){
    return driver.findElement(Contact_us);
    }

    public WebElement Input_field(){
    return driver.findElement(Input_field);
    }
    public WebElement To_Input_field() { return driver.findElement(To_Input_field);
    }
    public WebElement Date_of_Journey_input() { return driver.findElement(Date_of_Journey_input);
    }
    public WebElement Date_of_Return_input() { return driver.findElement(Date_of_Return_input); }

    public WebElement Search_Buses_Button() { return driver.findElement(Search_Buses_Button); }
    public WebElement Selected_Date() { return driver.findElement(Selected_Date); }

    public WebElement Departure_Text(){
    return driver.findElement(Departure_Text);
    }
    public WebElement Return_Text(){
    return driver.findElement(Return_Text);
    }
    public WebElement pre_Day(){
    return driver.findElement(pre_Day);
    }
    public WebElement Next_Day(){
    return driver.findElement(Next_Day);
    }

    public WebElement Add_Return_Ticket(){
    return driver.findElement(Add_Return_Ticket);
    }

    public WebElement Modify_Search_Button(){
    return driver.findElement(Modify_Search_Button);
    }
    public WebElement Operator_Bus_Type(){
    return driver.findElement(Operator_Bus_Type);
    }
    public WebElement View_Seats(){
    return driver.findElement(View_Seats);
    }

    public WebElement Choose_your_seats(){
    return driver.findElement(Choose_your_seats);
    }

    public WebElement Available_seats(){
    return driver.findElement(Available_seats);
    }
    public WebElement Booked_Seats(){
    return driver.findElement(Booked_Seats);
    }

    public WebElement Selected_Seats(){
    return driver.findElement(Selected_Seats);
    }

    public WebElement Hidden_sits(){
    return driver.findElement(Hidden_sits);
    }
    public WebElement Total(){
    return driver.findElement(Total);
    }

    public WebElement Choose_Boarding_Point(){
    return driver.findElement(Choose_Boarding_Point);
    }

    public WebElement Boarding_points(){
    return driver.findElement(Boarding_points);
    }

    public WebElement Continue_sits(){
    return driver.findElement(Continue_sits);
    }



}
