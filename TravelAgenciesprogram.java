/*
Problem Statement

Create a class TravelAgencies with below attributes:
regNo – int
agencyName – String
packageType – String
price – int
flightFacility – boolean

Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence.
Create class Solution with main method. Implement two static methods – findAgencyWithHighestPackagePrice and agencyDetailsforGivenIdAndType in Solution class.

findAgencyWithHighestPackagePrice method:
This method will take array of TravelAgencies objects as an input parameter and return the highest package price from the given array of objects.

agencyDetailsForGivenldAndType method:
This method will take three input parameters -array of TravelAgencies objects, int parameter regNo and String parameter packageType.
The method will return the TravelAgencies object based on below conditions.
FlightFacility should be available.

The input parameters(regNo and packageType) should matched with the regNo and packageType of TravelAgencies object.
If any of the above conditions are not met, then the method should return null. Note : Same Travel agency can have more than one package type.
Travel agency and package type combination is unique.

+All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.
For findAgencyWithHighestPackagePrice method – The main method should print the highestPackagePrice as it is.
For agencyDetailsForGivenldAndType method -The main method should print the AgencyName and price of the returned object.
The AgencyName and price should be concatinated with : while printing.

        Input
        123
        A2Z Agency
        Platinum
        50000
        true
        345
        SSS Agency
        Gold
        30000
        false
        987
        Cox and Kings
        Diamond
        40000
        true
        888
        Global Tours
        Silver
        20000
        false
        987
        Diamond


        Output
        50000
        Cox and Kings:40000
        */

    import java.util.Scanner;
    public class TravelAgenciesprogram {
    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
     TravelAgencies [] arr = new TravelAgencies[4]; // object
     for (int i=0;i<4;i++)
     {
         int a= sc.nextInt();sc.nextLine();
         String b=sc.nextLine();
         String c=sc.nextLine();
         int d=sc.nextInt();sc.nextLine();
         boolean e=sc.nextBoolean();sc.nextLine();

         arr[i]= new TravelAgencies(a,b,c,d,e); //storing ho rahi hai

     }
     int inputregno=sc.nextInt();sc.nextLine();
     String inputpackage=sc.nextLine();

       int maxx = findAgencyWithHighestPackagePrice(arr);
       System.out.println(maxx);

       TravelAgencies result =agencyDetailsForGivenIdAndType(arr,inputregno,inputpackage);
       System.out.println(result.agencyName+":"+result.price);
   }

   public static int findAgencyWithHighestPackagePrice(TravelAgencies[] arr)
   {
       int max= arr[0].price;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i].price>max)
           {
               max=arr[i].price;
           }
       }
       return max;
   }
   public static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[]arr,int regno,String packagetype)
   {
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i].flightFacility==true) // fight
           {
               if(arr[i].regNO==regno && arr[i].packageType.equalsIgnoreCase(packagetype))
               {
                   return arr[i];
               }
           }
       }

       return null;
   }


}
class TravelAgencies{
    int regNO;
    String agencyName;
    String packageType;
    int price;
    Boolean flightFacility;

    public TravelAgencies(int regNO, String agencyName, String packageType, int price, Boolean flightFacility) {
        this.regNO = regNO;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }
//    getter and setter
    public int getRegNO()
    {
        return regNO;
    }

    public void setRegNO(int regNO)
    {
        this.regNO = regNO;
    }

    public String getAgencyName()
    {
        return agencyName;
    }

    public void setAgencyName(String agencyName)
    {
        this.agencyName = agencyName;
    }

    public String getPackageType()
    {
        return packageType;
    }

    public void setPackageType(String packageType)
    {
        this.packageType = packageType;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public Boolean getFlightFacility()
    {
        return flightFacility;
    }

    public void setFlightFacility(Boolean flightFacility)
    {
        this.flightFacility = flightFacility;
    }
}