package Seminar2;

public class Dog extends Pet implements MakeASound{
    enum thePreseneceOfTraining{
        trained,notTrained;
    }
    static private thePreseneceOfTraining training = thePreseneceOfTraining.notTrained;

    public void train(){
        if (training == thePreseneceOfTraining.notTrained){
            training = thePreseneceOfTraining.trained;
            System.out.println("Собака проходит полноценные тренировки,и в скором времени она станет дрессированная");
        } else System.out.println("Собака уже дрессированная");
    }
    @Override
    public void caress() {

    }
    @Override
    public void makeASound() {

    }
}
