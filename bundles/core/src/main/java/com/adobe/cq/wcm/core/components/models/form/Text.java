/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 ~ Copyright 2016 Adobe Systems Incorporated
 ~
 ~ Licensed under the Apache License, Version 2.0 (the "License");
 ~ you may not use this file except in compliance with the License.
 ~ You may obtain a copy of the License at
 ~
 ~     http://www.apache.org/licenses/LICENSE-2.0
 ~
 ~ Unless required by applicable law or agreed to in writing, software
 ~ distributed under the License is distributed on an "AS IS" BASIS,
 ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 ~ See the License for the specific language governing permissions and
 ~ limitations under the License.
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
package com.adobe.cq.wcm.core.components.models.form;

/**
 * Defines the form {@code Text} Sling Model used for the {@code /apps/core/wcm/components/form/text} component.
 */
public interface Text extends Field {

    /**
     * Checks if the user must provide input for this field.
     *
     * @return {@code true} if the field must have a input
     * <br>
     * {@code false} otherwise
     */
    boolean isRequired();

    /**
     * @return The message to be displayed if the field is required
     * but has not been filled by the user
     * @see #isRequired()
     */
    String getRequiredMessage();

    /**
     * @return value of placeholder attribute.
     */
    String getPlaceholder();

    /**
     * checks if the field should be rendered read only on the page
     *
     * @return {@code true} if the field should be read-only
     * <br>
     * {@code false} otherwise
     */
    boolean isReadOnly();

    /**
     * @return the default value of the field
     */
    String getDefaultValue();

    /**
     * @return the message to be displayed when the constraint specified by {@link #getType()}
     * is not fulfilled
     */
    String getConstraintMessage();

    /**
     * Gets the type of the input field such as text, textarea, date, email etc.
     * The types other than textarea are as defined under HTML5.
     *
     * @return the type of the field
     */
    String getType();

    /**
     * @return the number of rows the text area should display
     */
    int getRows();
}
