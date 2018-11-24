import java.util.ArrayList;
/**
 * @author Taylor Cass
 * 
 * Strategy pattern
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck rubber = new RubberDuck();
        Duck model = new ModelDuck();
        ArrayList<Duck> ducks = new ArrayList<>();

        //add the ducks to the ArrayList
        ducks.add(mallard);
        ducks.add(rubber);
        ducks.add(model);

        //go through each duck
        for(Duck d : ducks){
            d.display();
            d.performQuack();
            d.performFly();
            System.out.println("");
        }
        
    }
}