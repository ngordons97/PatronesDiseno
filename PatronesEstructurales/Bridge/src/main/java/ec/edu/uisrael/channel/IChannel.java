package ec.edu.uisrael.channel;

public interface IChannel {
    Double getCardByNumber(String cardNumber);
    Double getBalance(String cardNumber);
    Boolean setBalance(String cardNumber, Double amount);
}