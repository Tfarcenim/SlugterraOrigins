package tfar.slugterraorigins.datagen;

import io.github.edwinmindcraft.origins.api.registry.OriginsDynamicRegistries;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import tfar.slugterraorigins.SlugterraOrigins;
import tfar.slugterraorigins.init.SOOrigins;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class SODatapackProvider extends DatapackBuiltinEntriesProvider {

    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(OriginsDynamicRegistries.ORIGINS_REGISTRY, SOOrigins::bootstrap);

    public SODatapackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(SlugterraOrigins.MOD_ID));
    }
}
