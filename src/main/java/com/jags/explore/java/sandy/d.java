package com.jags.explore.java.sandy;

import java.io.*;
class d
{

    public static void main(String args[]) throws IOException {
        main();
    }
    public static void main() throws IOException
    {
        String item[]=new String[29];
        double total=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("                      Kentucky Fried Chicken                        ");
        System.out.println("");
        System.out.println("                               MENU                                 ");
        System.out.println("1.Snacks");
        System.out.println("2.Burgers");
        System.out.println("3.Toasted wings");
        System.out.println("4.Hot Chicken");
        System.out.println("5.Share a Bucket");
        System.out.println("6.Rice bowlz");
        System.out.println("7.Krushers");
        System.out.println("8.Rolls");
        System.out.println("9.Dessert & Beverages");
        System.out.println("Enter your choice of number which you would like to eat");
        int n=Integer.parseInt(br.readLine());
        switch(n)
        {
            case 1:
            {
                System.out.println('\u000c');
                System.out.println("You have chosen SNACKERS to eat.");
                System.out.println("1.Hot brown with dip");
                System.out.println("2.Hot wings(5 pc)");
                System.out.println("3.Small Fries");
                System.out.println("Choose any one of the Snackers you want to eat:");
                int d=Integer.parseInt(br.readLine());
                if(d==1)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to eat Hot brown with dip");
                    System.out.println("It will cost you Rs.40/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans=br.readLine();
                    String k="Yes";
                    if(ans.equalsIgnoreCase(k))
                    {
                        item[0]="Hot brown with dip";
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+40;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=ans;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=ans;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }

                }
                if(d==2)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to eat Hot wings(5 pc)");
                    System.out.println("It will cost you Rs.50/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        item[1]="Hot wings(5 pc)";
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+50;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                if(d==3)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to eat Small fries");
                    System.out.println("It will cost you Rs.50/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        item[2]="Small Fries";
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+50;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                break;
            }
            case 2:
            {
                System.out.println('\u000c');
                System.out.println("You have chosen BURGERS to eat.");
                System.out.println("1.Cheezy crunch burger");
                System.out.println("2.Chicken zinger");
                System.out.println("3.Paneer zinger");
                System.out.println("4.OMG Burger");
                System.out.println("Choose any one of the Burgers you want to eat:");
                int d=Integer.parseInt(br.readLine());
                if(d==1)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to eat Cheezy crunch Burger");
                    System.out.println("It will cost you Rs.65/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+65;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                if(d==2)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to eat Chicken zinger");
                    System.out.println("It will cost you Rs.75/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+75;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                if(d==3)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to eat Paneer zinger");
                    System.out.println("It will cost you Rs.55/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println("Thank you purchasing this item");
                        total=total+55;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                if(d==4)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to eat OMG Burger");
                    System.out.println("It will cost you Rs.80/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println("Thank you purchasing this item");
                        total=total+80;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                break;
            }
            case 3:
            {
                System.out.println('\u000c');
                System.out.println("You have chosen TOASTED WINGS to eat.");
                System.out.println("1.Cheezy crunch wrap(veg)");
                System.out.println("2.Chicken toasted wings");
                System.out.println("Choose any one of the Toasted wings you want to eat:");
                int d=Integer.parseInt(br.readLine());
                if(d==1)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to eat Cheezy crunch wrap");
                    System.out.println("It will cost you Rs.45/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+45;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                if(d==2)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to eat Chicken crunch wrap");
                    System.out.println("It will cost you Rs.65/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+65;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                break;
            }
            case 4:
            {
                System.out.println('\u000c');
                System.out.println("You have chosen HOT CHICKEN to eat.");
                System.out.println("1.Hot & Crispy(2 pc)");
                System.out.println("2.Hot & Crispy(4 pc)");
                System.out.println("3.Fiery grilled(2 pc)");
                System.out.println("4.Fiery grilled(4 pc)");
                System.out.println("Choose any one of the Hot Chicken you want to eat:");
                int d=Integer.parseInt(br.readLine());
                if(d==1)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to eat HOT & CRISPY(2 pc)");
                    System.out.println("It will cost you Rs.55/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+55;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                if(d==2)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to eat HOT & CRISPY(4 pc)");
                    System.out.println("It will cost you Rs.75/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+75;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                if(d==3)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to eat FIERY GRILLED(2 pc)");
                    System.out.println("It will cost you Rs.65/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+65;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                if(d==4)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to eat FIERRY GRILLED(4 pc)");
                    System.out.println("It will cost you Rs.85/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println("Thank you purchasing this item");
                        total=total+85;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                break;
            }
            case 5:
            {
                System.out.println('\u000c');
                System.out.println("You have chosen SHARE A BUCKET to eat.");
                System.out.println("1.Hot & Crispy(8 pc)");
                System.out.println("2.Fiery grilled(8 pc)");
                System.out.println("3.Fiery grilled(12 pc)");
                System.out.println("4.Mingles bucket");
                System.out.println("Choose any one of the Share a Bucket you want to eat:");
                int d=Integer.parseInt(br.readLine());
                if(d==1)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to eat HOT & CRISPY(8 pc)");
                    System.out.println("It will cost you Rs.85/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+85;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                if(d==2)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to eat FIERRY GRILLED(8 pc)");
                    System.out.println("It will cost you Rs.145/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+145;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                if(d==3)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to eat FIERRY GRILLED(12 pc)");
                    System.out.println("It will cost you Rs.185/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+185;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                if(d==4)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to eat MINGLES BUCKET");
                    System.out.println("It will cost you Rs.215/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+215;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                break;
            }
            case 6:
            {
                System.out.println('\u000c');
                System.out.println("You have chosen RICE BOWLZ to eat.");
                System.out.println("1.Veg rice bowl");
                System.out.println("2.Popcorn chicen rice bowlz");
                System.out.println("3.Fiery grilled rice bowlz");
                System.out.println("Choose any one of the Rice bowlz you want to eat:");
                int d=Integer.parseInt(br.readLine());
                if(d==1)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to eat VEG RICE BOWL");
                    System.out.println("It will cost you Rs.35/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+35;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                if(d==2)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to eat POPCORN CHICEN RICE BOWLZ");
                    System.out.println("It will cost you Rs.55/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+55;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                if(d==3)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to eat FIERY GRILLED RICE BOWLZ");
                    System.out.println("It will cost you Rs.85/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+85;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                break;
            }
            case 7:
            {
                System.out.println('\u000c');
                System.out.println("You have chosen KRUSHERS to drink.");
                System.out.println("1.ChocoLash");
                System.out.println("2.Alphonso burst");
                System.out.println("3.Strawberry Burst");
                System.out.println("Choose any one of the Rice bowlz you want to eat:");
                int d=Integer.parseInt(br.readLine());
                if(d==1)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to drink ChocoLash");
                    System.out.println("It will cost you Rs.35/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+35;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                if(d==2)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to drink Alphonso burst");
                    System.out.println("It will cost you Rs.45/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+45;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                if(d==3)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to drink Strawberry burst");
                    System.out.println("It will cost you Rs.45/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+45;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                break;
            }
            case 8:
            {
                System.out.println('\u000c');
                System.out.println("You have chosen ROLLS to eat.");
                System.out.println("1.Veg Nuggets Roll");
                System.out.println("2.Fried Chicken Roll");
                System.out.println("Choose any one of the Rolls you want to eat:");
                int d=Integer.parseInt(br.readLine());
                if(d==1)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to eat VEG NUGGETS ROLL");
                    System.out.println("It will cost you Rs.55/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+55;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                if(d==2)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to eat FRIED CHICKEN ROLL");
                    System.out.println("It will cost you Rs.65/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+65;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                break;
            }
            case 9:
            {
                System.out.println('\u000c');
                System.out.println("You have chosen DESSERTS & BEVERAGES.");
                System.out.println("1.Brownie");
                System.out.println("2.Brownie with Ice cream");
                System.out.println("3.Ice tea");
                System.out.println("4.Cola(1 bottle)");
                System.out.println("Choose any one of the Rice bowlz you want to eat:");
                int d=Integer.parseInt(br.readLine());
                if(d==1)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to eat BROWNIE");
                    System.out.println("It will cost you Rs.95/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+95;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                if(d==2)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to eat BROWNIE WITH ICE CREAM");
                    System.out.println("It will cost you Rs.110/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+110;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                if(d==3)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to drink ICE TEA");
                    System.out.println("It will cost you Rs.40/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+40;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }

                if(d==4)
                {
                    System.out.println('\u000c');
                    System.out.println("You have chosen to drink COLA(1 bottle)");
                    System.out.println("It will cost you Rs.40/-");
                    System.out.println("Do you want to buy this item?");
                    System.out.println("YES or NO");
                    String ans1=br.readLine();
                    String h="yes";
                    if(ans1.equalsIgnoreCase(h))
                    {
                        System.out.println('\u000c');
                        System.out.println("Thank you purchasing this item");
                        total=total+40;
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String ans=br.readLine();
                        String s1=ans;String s2="yes";
                        if(ans.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                    else
                    {
                        System.out.println("Do you want to buy any other item");
                        System.out.println("YES or NO");
                        String j=br.readLine();
                        String s1=j;String s2="yes";
                        if(j.equalsIgnoreCase(s2))
                        {
                            System.out.println('\u000c');
                            main();
                        }
                        else
                        {
                            System.out.println("Thank you");
                        }
                    }
                }
                break;
            }
        }
        System.out.println('\u000c');
        System.out.println("           BILL     ");
        for(int i=0;i<29;i++){
            if(item[i]!=null){
                System.out.println(item[i]);
            }
        }
    }
}
