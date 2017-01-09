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
package com.adobe.cq.wcm.core.components.commons.form;

/**
 * Some constants for the form components.
 */
public class FormConstants {

    /** The prefix for all core form related resource types.*/
    public final static String RT_CORE_FORM_PREFIX = "core/wcm/components/form/";

    /** The resource type for form container version 1. */
    public final static String RT_CORE_FORM_CONTAINER_V1 = RT_CORE_FORM_PREFIX + "container/v1/container";

    /** Array of all resource types for the form container, including versions */
    public final static String[] RT_ALL_CORE_FORM_CONTAINER = { RT_CORE_FORM_CONTAINER_V1 };

    /** Node-name of the touch based dialog for form actions */
    public static final String NN_DIALOG = "cq:dialog";

    /** The resource type for form button */
    public final static String RT_CORE_FORM_BUTTON = "core/wcm/components/form/button";
}
