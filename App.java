public class App {
    public static void main(String[] args) throws Exception {

        Hero he1 = new Hero();
        he1.move(); 
        he1.move("Icaa");
        Hero he2 = new Fighter();
        he2.move(); 

        Enemy en1 = new Enemy();
        en1.move(); 
        en1.move(1);
        Enemy enemy2 = new Witch();
        enemy2.move(); 
        
        Character character1 = new Hero();
        character1.move(); 
        Character character2 = new Enemy();
        character2.move(); 
        Character character3 = new Witch();
        character3.move(); 
        Character character4 = new Fighter();
        character4.move(); 
        
        Character character5 = new Witch();
        character5.move(); 
        Hero he3 = (Hero) character5;
        Fighter fighter1 = (Fighter) he3;
        fighter1.move(); 
    }
}
