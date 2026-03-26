public class SalePerson implements Comparable {
    private String firstName;
    private String lastName;
    private int totalSales;

    // Constructor
    public SalePerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName()  { return lastName; }
    public int getTotalSales()   { return totalSales; }

    // Returns: "lastName , firstName : totalSales"
    public String toString() {
        return lastName + " , " + firstName + " : " + totalSales;
    }

    // Checks if first and last names are the same
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SalePerson)) return false;
        SalePerson other = (SalePerson) o;
        return this.firstName.equals(other.firstName) &&
                this.lastName.equals(other.lastName);
    }

    // compareTo for sorting:
    // Since WeeklySales needs DESCENDING order (most to least sales),
    // and insertionSort is now descending, we compare normally:
    // return negative if this < other, positive if this > other.
    // Tie-break: ascending alphabetical order of lastName.
    public int compareTo(Object o) {
        SalePerson other = (SalePerson) o;
        if (this.totalSales != other.totalSales)
            return this.totalSales - other.totalSales;  // ascending by sales
        else
            return other.lastName.compareTo(this.lastName);  // tie-break by lastName ascending
    }
}