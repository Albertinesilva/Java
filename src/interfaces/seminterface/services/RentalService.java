package interfaces.seminterface.services;

import java.time.Duration;

import interfaces.seminterface.models.CarRental;
import interfaces.seminterface.models.Invoice;

public class RentalService {

  private Double pricePerHour;
  private Double pricePerDay;

  private BrazilTaxService taxService;

  public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
    this.pricePerHour = pricePerHour;
    this.pricePerDay = pricePerDay;
    this.taxService = taxService;
  }

  public void processInvoice(CarRental carRental) {
    double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
    // double hours = Math.ceil(minutes / 60);
    double hours = minutes / 60;

    double basicPayment;
    if (hours <= 12.0) {
      basicPayment = pricePerHour * Math.ceil(hours);
    } else {
      basicPayment = pricePerDay * Math.ceil(hours / 24);
    }

    double tax = taxService.tax(basicPayment);

    carRental.setInvoice(new Invoice(basicPayment, tax));
  }
}
