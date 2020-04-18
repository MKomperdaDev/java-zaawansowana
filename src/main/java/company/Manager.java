package company;

public class Manager extends Employee {
    public Manager(String name, int salary) {
        super(name, salary);
        this.bonus=0;
    }

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;

    }

    private int bonus;

    public void makeSpeach(){
        System.out.println("Sluchajcie moich polecen");
    }

    public void makeSpeach(String str){
        this.makeSpeach();
        System.out.println(str);
    }

    @Override
    public void show() {
        getSalary();
        super.show();
    }

    @Override
    public int getSalary() {
        return salary+ bonus;
    }

    private Secretary secretary;

    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }

    public void makeCall(String number){
        if(this.secretary==null){
            System.out.println("Nie umiem dzwonic");
        } else {
            System.out.println("Deleguje zadanie");
            this.secretary.makeCall(number);
        }
    }
}
