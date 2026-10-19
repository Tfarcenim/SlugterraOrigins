package tfar.slugterraorigins.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import tfar.slugterraorigins.SlugterraOrigins;

public class LangProvider extends LanguageProvider {
    public LangProvider(PackOutput output) {
        super(output, SlugterraOrigins.MOD_ID,"en_us");
    }

    @Override
    protected void addTranslations() {
        add("origins", "lang");
    }
}
