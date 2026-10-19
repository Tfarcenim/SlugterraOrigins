package tfar.slugterraorigins.init;

import io.github.edwinmindcraft.apoli.api.power.configuration.ConfiguredPower;
import io.github.edwinmindcraft.apoli.api.registry.ApoliDynamicRegistries;
import io.github.edwinmindcraft.origins.api.OriginsAPI;
import io.github.edwinmindcraft.origins.api.data.PartialOrigin;
import io.github.edwinmindcraft.origins.api.origin.Origin;
import io.github.edwinmindcraft.origins.api.registry.OriginsDynamicRegistries;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import tfar.slugterraorigins.SlugterraOrigins;

import java.util.List;
import java.util.Set;

public class SOOrigins {

    public static final ResourceKey<Origin> CAVE_TROLL = ResourceKey.create(OriginsDynamicRegistries.ORIGINS_REGISTRY, SlugterraOrigins.id("cave_troll"));

    public static void bootstrap(BootstapContext<Origin> context) {

        ResourceKey<ConfiguredPower<?,?>> aquaAffinity = ResourceKey.create(ApoliDynamicRegistries.CONFIGURED_POWER_KEY,
                new ResourceLocation(OriginsAPI.MODID,"aqua_affinity"));

        HolderGetter<ConfiguredPower<?,?>> holderGetter = context.lookup(ApoliDynamicRegistries.CONFIGURED_POWER_KEY);

        PartialOrigin caveTroll = new PartialOrigin(List.of(HolderSet.direct(holderGetter.getOrThrow(aquaAffinity))),Items.SLIME_BALL.getDefaultInstance(),
                false,1,null,null,null,Set.of(),1);

        Origin origin = caveTroll.create(SlugterraOrigins.id("cave_troll"));

        context.register(CAVE_TROLL,origin);
;    }
}
