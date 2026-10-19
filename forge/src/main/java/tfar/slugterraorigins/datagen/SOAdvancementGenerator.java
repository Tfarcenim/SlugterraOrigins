package tfar.slugterraorigins.datagen;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;
import tfar.slugterraorigins.SlugterraOrigins;

import java.util.function.Consumer;

public class SOAdvancementGenerator implements ForgeAdvancementProvider.AdvancementGenerator {


    @Override
    public void generate(HolderLookup.Provider registries, Consumer<Advancement> consumer, ExistingFileHelper fileHelper) {
        boolean showAdvancements = true;
        
        Advancement unlockShadowClan = Advancement.Builder.advancement()
                .display(Items.COOKIE, Component.literal("Unlock Shadow Clan"), Component.literal("Unlock Shadow Clan Origin"),
                        ResourceLocation.withDefaultNamespace("textures/gui/advancements/backgrounds/end.png"),
                        FrameType.TASK, showAdvancements, showAdvancements, !showAdvancements)
                .addCriterion("eat_cookie", ConsumeItemTrigger.TriggerInstance.usedItem(Items.COOKIE))
                .save(consumer, SlugterraOrigins.id("unlock_shadow_clan"),fileHelper);

    }
}
