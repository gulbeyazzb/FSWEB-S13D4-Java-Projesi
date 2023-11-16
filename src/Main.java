import com.workintech.model.Player;
import com.workintech.model.Point;
import com.workintech.model.Weapon;

public class Main {
    public static void main(String[] args) {

        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());

        System.out.println("**************");

        Player rosella=new Player("Rosella",60, Weapon.AXE);
        System.out.println(rosella);
        rosella.restoreHealth(20);
        rosella.loseHealth(40);
        rosella.loseHealth(Weapon.SWORD.getDamage());
        System.out.println(rosella.healthRemaining());
    }

}