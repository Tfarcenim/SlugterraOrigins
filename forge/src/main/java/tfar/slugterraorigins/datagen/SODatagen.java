package tfar.slugterraorigins.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;
import net.minecraftforge.data.event.GatherDataEvent;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class SODatagen {

    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        generator.addProvider(true,new LangProvider(output));

        DatapackBuiltinEntriesProvider datapackProvider = new SODatapackProvider(output,lookupProvider);
       // generator.addProvider(true,datapackProvider);

        //lookupProvider = datapackProvider.getRegistryProvider();

        generator.addProvider(true,new ForgeAdvancementProvider(output,lookupProvider,existingFileHelper, List.of(new SOAdvancementGenerator())));

    }
}
