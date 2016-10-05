/*
 * Copyright 2016 Claymore Minds Limited and Niche Solutions (UK) Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.viewserver.expression.tree.lt;

import io.viewserver.expression.tree.*;
import io.viewserver.schema.column.ColumnType;

/**
 * Created by nickc on 14/10/2014.
 */
public class LTExpression {
    public static IExpression createLT(ColumnType type, IExpression lhs, IExpression rhs) {
        switch (type) {
            case Bool: {
                return new LTBool((IExpressionBool)lhs, (IExpressionBool)rhs);
            }
            case Byte: {
                return new LTByte((IExpressionByte)lhs, (IExpressionByte)rhs);
            }
            case Short: {
                return new LTShort((IExpressionShort)lhs, (IExpressionShort)rhs);
            }
            case Int: {
                return new LTInt((IExpressionInt)lhs, (IExpressionInt)rhs);
            }
            case Long: {
                return new LTLong((IExpressionLong)lhs, (IExpressionLong)rhs);
            }
            case Float: {
                return new LTFloat((IExpressionFloat)lhs, (IExpressionFloat)rhs);
            }
            case Double: {
                return new LTDouble((IExpressionDouble)lhs, (IExpressionDouble)rhs);
            }
            case String: {
                return new LTString((IExpressionString)lhs, (IExpressionString)rhs);
            }
            default: {
                throw new IllegalArgumentException("Cannot create less-than expression for type " + type);
            }
        }
    }
}