/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 *
 * @author dfguzman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize Api Context
        ApiContextInitializer.init();

        // Instantiate Telegram Bots API
        TelegramBotsApi botsApi = new TelegramBotsApi();

        // Register our bot
        try {
            botsApi.registerBot(new MyAmazingBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        System.out.println("DieBotTokens successfully started!");
    }

}
