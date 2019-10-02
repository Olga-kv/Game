public class Goblin {
    private int _health;
    private int _powerOfAttack;
    private int _armorPlating;

    Goblin(){
        this._health=20;
        this._powerOfAttack=6;
        this._armorPlating=1;
    }

    public int get_health(){return this._health;}
    public int get_powerOfAttack(){return this._powerOfAttack;}
    public int get_armorPlating(){return this._armorPlating;}

    public void set_health(int health){this._health=health;}
    public void set_powerOfAttack(int power){this._powerOfAttack=power;}
    public void set_armorPlating(int armorPlating){this._armorPlating=armorPlating;}
}