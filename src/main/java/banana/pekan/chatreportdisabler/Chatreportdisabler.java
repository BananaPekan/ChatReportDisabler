package banana.pekan.chatreportdisabler;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Chatreportdisabler extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(this, this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "ChatReportDisabler plugin is enabled.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "ChatReportDisabler plugin is disabled.");
    }

    @EventHandler
    public void onChatSend(AsyncPlayerChatEvent event) {
        event.setMessage(event.getMessage() + " ");
    }

}
