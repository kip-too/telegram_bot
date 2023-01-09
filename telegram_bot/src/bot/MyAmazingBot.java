package bot;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class MyAmazingBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
    if(update.hasMessage() && update.getMessage().hasText()){
        String message_text = update.getMessage.getText();
        long chat_id = update.getMessage().getChatId();

        SendMessage message = new sendMessage()
               .setChatId(chat_id)
               .setText(message_text);
    }
    try {
        execute(message);
    } catch (TelegramApiException e) {
         e.printStackTrace();
    }
    }

    @Override
    public String getBotUsername() {
        return "MyAmazingBot";
    }

    @Override
    public String getBotToken() {
        return "12345:qwertyuiopASDGFHKMK";
    }
}
