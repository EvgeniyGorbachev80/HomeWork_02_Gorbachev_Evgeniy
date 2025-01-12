package org.Gorbachev;

// todo Реализовать класс Market и все методы, которые он обязан реализовывать.
//  Методы из интерфейса QueueBehaviour, имитируют работу очереди, MarketBehaviour – помещает и удаляет
//  человека из очереди, метод update – обновляет состояние магазина (принимает и отдает заказы).
public class Main {
    public static void main(String[] args) {
        Human hm = new Human();
        hm.name = "Evgeniy";

        Market market = new Market();

        market.acceptToMarket(hm);
        market.takeInQueue(hm);
        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(hm);
        market.update();
    }
}
