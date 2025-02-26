package com.ordwen.odailyquests.events.listeners.item;

import com.ordwen.odailyquests.quests.QuestType;
import com.ordwen.odailyquests.quests.player.progression.checkers.AbstractItemChecker;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;

public class EnchantItemListener extends AbstractItemChecker implements Listener {

    @EventHandler
    public void onEnchantItemEvent(EnchantItemEvent event) {
        setPlayerQuestProgression(event.getEnchanter(), event.getItem(), 1, QuestType.ENCHANT, null);
    }
}
