package version3;

import java.util.Random;

public class Fightman {
    Random random = new Random();
    String[] face = {"1", "2", "3","4","5","6"};
    private String preface;
    private String name;
    private double blood;
    private double fight;

    private double defense;

    public Fightman() {
    }

    public Fightman(String name, double blood, double fight, double defense) {
        this.name = name;
        this.blood = blood;
        this.fight = fight;
        this.defense = defense;
        setPerface();
    }


    public void attack(Fightman fightedman) {
        if (this.getBlood() == 0) {
            System.out.println("无法攻击");
        } else if (fightedman.blood == 0) {
            System.out.println("目标已死");
        } else {
            double deblood = this.fight * (1 - fightedman.defense);
            fightedman.blood = fightedman.blood - deblood;
            if (fightedman.blood <= 0) {
                System.out.println(this.name + "击败了" + fightedman.name);
                fightedman.blood = 0;
            } else {
                System.out.println(this.name + "攻击" + fightedman.name + "造成了" + deblood + "点伤害，" + fightedman.name + "剩余" + fightedman.blood);
            }
        }
    }


    public String getPreface() {
        return preface;
    }


    public void setPerface() {
        int i=random.nextInt(face.length);
        this.preface = face[i];
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBlood() {
        return blood;
    }


    public void setBlood(double blood) {
        this.blood = blood;
    }


    public double getFight() {
        return fight;
    }


    public void setFight(double fight) {
        this.fight = fight;
    }

    public double getDefense() {
        return defense;
    }


    public void setDefense(double defense) {
        this.defense = defense;
    }

    public String toString() {
        return "Fightman{perface = " + preface + ", name = " + name + ", blood = " + blood + ", fight = " + fight + ", defense = " + defense + "}";
    }
}