package io.cotrix.jeecookbook

import org.asciidoctor.Asciidoctor
import org.asciidoctor.extension.spi.ExtensionRegistry

class CodeBlockSwitchExtension implements ExtensionRegistry {

    @Override
    public void register(Asciidoctor asciidoctor) {
        asciidoctor.javaExtensionRegistry().postprocessor(new CodeBlockSwitchPostProcessor());
    }
}