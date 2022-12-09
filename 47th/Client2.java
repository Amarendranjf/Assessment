package day12;

abstract class Window
{
    public abstract void write();
    public abstract void read();
}
class PMWindow extends Window
{
    @Override
    public void write() {
        System.out.println("PMWindow Write");
        
    }

    @Override
    public void read() {
        System.out.println("PMWindow Read");
        
    }
}

class MotifWindow extends Window
{



   @Override
    public void write() {
        System.out.println("MotifWindow write");
        
    }



   @Override
    public void read() {
        System.out.println("MotifWindow Read");
        
    }
}



abstract class ScrollBar
{
    public abstract void scrollTop();
    public abstract void scrollBottom();
}



class PMScrollBar extends ScrollBar
{



   @Override
    public void scrollTop() {
        System.out.println("PMScrollBar Top");
        
    }



   @Override
    public void scrollBottom() {
        System.out.println("PMScrollBar Bottom");
        
    }
}



class MotifScrollBar extends ScrollBar
{



   @Override
    public void scrollTop() {
        System.out.println("MotifScrollBar ScrollTop");
        
    }



   @Override
    public void scrollBottom() {
        System.out.println("MotifScrollBar ScrollBottom");
        
    }
}



abstract class WidgetFactory
{
    abstract Window createWindow();
    abstract ScrollBar createScrollBar();
}



class PMWidgetFactory extends WidgetFactory
{
    Window createWindow()
    {
        return new PMWindow();
    }
    ScrollBar createScrollBar()
    {
        return new PMScrollBar();
    }
}



class MotifWidgetFactory extends WidgetFactory
{
    Window createWindow()
    {
        return new MotifWindow();
    }
    ScrollBar createScrollBar()
    {
        return new MotifScrollBar();
    }
}



class FactoryMaker
{
    private static WidgetFactory pf=null;
    static WidgetFactory getFactory(String choice)
    {
        if(choice.equals("A"))
        {
            pf=new PMWidgetFactory();
        }
        else if(choice.equals("B"))
        {
            pf=new MotifWidgetFactory();
        }
        return pf;
    }
}



public class Client
{
    public static void main(String args[])
    {
        WidgetFactory af = FactoryMaker.getFactory("A");
        Window window = af.createWindow();
        window.write();
    }
}