package org.zalando.intellij.swagger.completion.field;

import com.intellij.codeInsight.completion.CompletionResultSet;
import org.zalando.intellij.swagger.completion.field.model.Fields;
import org.zalando.intellij.swagger.traversal.PositionResolver;

class ResponsesCompletion extends FieldCompletion {

    ResponsesCompletion(final PositionResolver positionResolver, final CompletionResultSet completionResultSet) {
        super(positionResolver, completionResultSet);
    }

    public void fill() {
        Fields.responses().forEach(this::addUnique);
    }

}