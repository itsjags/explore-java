package com.jags.explore.java.stackoverflow;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/**
 * Created by 36262Ja on 05/05/2015.
 */
public class Human {
  private int age;
  private float height;
  private float weight;
  private String name = new String();

  public Human() {
  }

  public Human(String name, int age, float height, float weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public Human(Human human) {
    this.name = human.getName();
    this.age = human.getAge();
    this.height = human.getHeight();
    this.weight = human.getWeight();
  }

  public static void writeFile(Human human, OutputStream output) throws IOException {
    output.write((human.getName() + "\n").getBytes());
    output.write((human.getAge() + "\n").getBytes());
    output.write((human.getHeight() + "\n").getBytes());
    output.write((human.getWeight() + "\n").getBytes());
  }

  public static Human readFile(InputStream input) throws IOException {
    int temp;
    String file = "";
    String[] fileArray;

    file += (char) input.read();
    while ((temp = input.read()) != -1) {
      file += (char) temp;
    }

    fileArray = file.split("\n", 0);

    Human madeHuman = new Human(fileArray[0], Integer.parseInt(fileArray[1]), Float.parseFloat(fileArray[2]), Float.parseFloat(fileArray[3]));

    return madeHuman;
  }

  public static void writeArrayListInFile(ArrayList<Human> humans, OutputStream output) throws IOException {
    for (int i = 0; i < humans.size(); i++) {
      output.write((humans.get(i).getName() + "\n").getBytes());
      output.write((humans.get(i).getAge() + "\n").getBytes());
      output.write((humans.get(i).getHeight() + "\n").getBytes());
      output.write((humans.get(i).getWeight() + "\n").getBytes());
      output.write('#');
    }
  }

  public static ArrayList<Human> readArrayListFromFile(InputStream input) throws IOException {
    int temp = ' ';
    String file = "";
    String[] fileArray1;
    String[][] fileArray2 = new String[10][];
    ArrayList<Human> madeHumanArrayList = new ArrayList<Human>();

    file += (char) input.read();
    while ((temp = input.read()) != -1) {
      file += (char) temp;
    }

    fileArray1 = file.split("#", 0);

    for (int i = 0; i < fileArray1.length; i++)
      for (int j = 0; j < 4; j++)
        fileArray2[i] = fileArray1[i].split("\n", 0);

    for (int i = 0; i < fileArray2.length; i++)
      madeHumanArrayList.add(new Human(fileArray2[i][0], Integer.parseInt(fileArray2[i][1]), Float.parseFloat(fileArray2[i][2]), Float.parseFloat(fileArray2[i][3])));//null pointer exception

    return madeHumanArrayList;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public float getHeight() {
    return height;
  }

  public void setHeight(float height) {
    this.height = height;
  }

  public float getWeight() {
    return weight;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}