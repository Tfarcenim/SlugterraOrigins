package tfar.slugterraorigins.init;

import io.github.edwinmindcraft.origins.api.origin.Origin;
import io.github.edwinmindcraft.origins.api.registry.OriginsDynamicRegistries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import tfar.slugterraorigins.SlugterraOrigins;

public class SOOrigins {

    public static final ResourceKey<Origin> CAVE_TROLL = ResourceKey.create(OriginsDynamicRegistries.ORIGINS_REGISTRY, SlugterraOrigins.id("cave_troll"));

    public static void bootstrap(BootstapContext<Origin> originBootstapContext) {

    }
}
