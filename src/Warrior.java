public class Warrior {
    private int _health;
    private int _powerOfAttack;
    private int _armorPlating;

    Warrior(){
        this._health=1000;
        this._powerOfAttack=10;
        this._armorPlating=3;
    }

    public int get_health(){return this._health;}
    public int get_powerOfAttack(){return this._powerOfAttack;}
    public int get_armorPlating(){return this._armorPlating;}

    public void set_health(int health){this._health=health;}
    public void set_powerOfAttack(int power){this._powerOfAttack=power;}
    public void set_armorPlating(int armorPlating){this._armorPlating=armorPlating;}
}
