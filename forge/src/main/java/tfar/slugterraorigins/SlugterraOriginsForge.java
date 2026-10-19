package tfar.slugterraorigins;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import tfar.slugterraorigins.datagen.SODatagen;

@Mod(SlugterraOrigins.MOD_ID)
public class SlugterraOriginsForge {
    
    public SlugterraOriginsForge() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(SODatagen::gatherData);
        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.
    
        // Use Forge to bootstrap the Common mod.
        SlugterraOrigins.init();
        
    }
}