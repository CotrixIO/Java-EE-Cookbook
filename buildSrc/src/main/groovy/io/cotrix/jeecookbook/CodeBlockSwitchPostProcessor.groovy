package io.cotrix.jeecookbook

import org.asciidoctor.ast.Document
import org.asciidoctor.extension.Postprocessor

class CodeBlockSwitchPostProcessor extends Postprocessor {

    String process(Document document, String output) {
        def css = getClass().getResource("/codeBlockSwitch.css").text
        def javascript = getClass().getResource("/codeBlockSwitch.js").text
        def replacement = """<style>
$css
</style>
<script src=\"http://cdnjs.cloudflare.com/ajax/libs/zepto/1.1.6/zepto.min.js\"></script>
<script type="text/javascript">
$javascript
</script>
</head>
"""
        return output.replace("</head>", replacement);
    }

}