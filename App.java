/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;
import java.net.MalformedURLException;


public class App {
    public void getGreeting() throws InterruptedException, MalformedURLException {

        //TestCases tests = new TestCases(); // Initialize your test class

        //Search_Amazon amazon = new Search_Amazon();
        Count_Hyperlinks hyperlinks = new Count_Hyperlinks();
        //Image_URLs imageUrls = new Image_URLs();
        //IMDB__ratings imdb = new IMDB__ratings();
        //Nested_Frames_Text frames = new Nested_Frames_Text();
        //Post_on_LinkedIn linkedin = new Post_on_LinkedIn();
        //Window_Handle windHandle = new Window_Handle();

        //TODO: call your test case functions one after other here
        
        //tests.testCase01();

        //amazon.searchAmazon();
        hyperlinks.countHyperlinks();
        //imageUrls.imageURLs();
        //imdb.imdbRatings();
        //frames.nestedFrames();
        //linkedin.linkedinPost();
        //windHandle.windowHandle();
        
        //END Tests

        //tests.endTest(); // End your test by clearning connections and closing browser

        //amazon.endTest();
        hyperlinks.endTest();
        //imageUrls.endTest();
        //imdb.endTest();
        //frames.endTest();
        //linkedin.endTest();
        //windHandle.endTest();

    }

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        new App().getGreeting();
    }
}