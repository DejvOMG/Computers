import java.math.BigDecimal;
import java.time.LocalDate;

public class CompanyComputer {
    // Atributy třídy (vlastnosti počítače)
    private String model;
    private double diagonalOfMonitor;
    private boolean isCompanyComputer;
    private BigDecimal price;
    private String computerType; // "Notebook" nebo "Desktop"
    private LocalDate dateAdded; // Datum přidání do evidence

    // Konstruktor - nastavíme hodnoty při vytvoření objektu
    public CompanyComputer(String model, double diagonalOfMonitor, boolean isCompanyComputer, BigDecimal price, String computerType, LocalDate dateAdded) {
        this.model = model;
        this.diagonalOfMonitor = diagonalOfMonitor;
        this.isCompanyComputer = isCompanyComputer;
        this.price = price;
        this.computerType = computerType;
        this.dateAdded = dateAdded;
    }

    // Metoda pro zobrazení informací o počítači
    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Uhlopříčka: " + diagonalOfMonitor + " palců");
        System.out.println("Firemní počítač: " + (isCompanyComputer ? "Ano" : "Ne"));
        System.out.println("Cena: " + price + " Kč");
        System.out.println("Typ počítače: " + computerType);
        System.out.println("Datum přidání: " + dateAdded);
    }
}
