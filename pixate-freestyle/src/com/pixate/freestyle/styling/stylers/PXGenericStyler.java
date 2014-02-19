/*******************************************************************************
 * Copyright 2012-present Pixate, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.pixate.freestyle.styling.stylers;

import java.util.Map;

import com.pixate.freestyle.annotations.PXAStyler;

@PXAStyler(hide=true)
public class PXGenericStyler extends PXStylerBase {

    private Map<String, PXDeclarationHandler> declarationHandlers;

    public PXGenericStyler(PXStylerInvocation invocation) {
        super(invocation);
    }

    public PXGenericStyler(Map<String, PXDeclarationHandler> handlers) {
        super(null);
        this.declarationHandlers = handlers;
    }

    public PXGenericStyler(Map<String, PXDeclarationHandler> handlers, PXStylerInvocation invocation) {
        super(invocation);
        this.declarationHandlers = handlers;
    }

    @Override
    public Map<String, PXDeclarationHandler> getDeclarationHandlers() {
        return declarationHandlers;
    }

}
