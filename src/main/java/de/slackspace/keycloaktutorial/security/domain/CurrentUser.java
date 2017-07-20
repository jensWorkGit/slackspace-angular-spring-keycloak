package de.slackspace.keycloaktutorial.security.domain;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
// @Retention Wo ist die Annotation sichtbar? Nur für den Compiler oder auch für die Laufzeitumgebung?
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CurrentUser {}
