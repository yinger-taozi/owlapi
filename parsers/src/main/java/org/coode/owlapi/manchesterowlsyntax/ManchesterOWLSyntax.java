/*
 * This file is part of the OWL API.
 *
 * The contents of this file are subject to the LGPL License, Version 3.0.
 *
 * Copyright (C) 2011, The University of Manchester
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0
 * in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 *
 * Copyright 2011, University of Manchester
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.coode.owlapi.manchesterowlsyntax;

/** The vocabulary that the Manchester OWL Syntax uses.
 * 
 * @author Matthew Horridge, The University Of Manchester, Bio-Health
 *         Informatics Group, Date: 25-Apr-2007 */
@SuppressWarnings("javadoc")
public enum ManchesterOWLSyntax {
    //@formatter:off
    
//    public static final String VALUE_PARTITION = "ValuePartition:";
//    public static final String INSTANCES = "Instances:";
    
    VALUE_PARTITION             ("ValuePartition",            false, false, false, false, false),
    DASH                        ("-",                         false, false, false, false, false, "-"),
    OPEN                        ("(",                         false, false, false, false, false, "("),
    CLOSE                       (")",                         false, false, false, false, false, ")"),
    OPENBRACE                   ("{",                         false, false, false, false, false, "{"),
    CLOSEBRACE                  ("}",                         false, false, false, false, false, "}"),
    OPENBRACKET                 ("[",                         false, false, false, false, false, "["),
    CLOSEBRACKET                ("]",                         false, false, false, false, false, "]"),    
    ONTOLOGY                    ("Ontology",                  false, false, false, false, false),
    IMPORT                      ("Import",                    false, true,  true,  false, false),
    PREFIX                      ("Prefix",                    false, false, false, false, false),
    CLASS                       ("Class",                     true,  true,  false, false, false),
    OBJECT_PROPERTY             ("ObjectProperty",            true,  true,  false, false, false),
    CHAIN_IMPLY                 ("->",                        true,  true,  false, false, false, "->"),
    CHAIN_CONNECT               ("o",                         true,  true,  false, false, false, "o"),
    DATA_PROPERTY               ("DataProperty",              true,  true,  false, false, false),
    INDIVIDUAL                  ("Individual",                true,  true,  false, false, false),
    DATATYPE                    ("Datatype",                  true,  true,  false, false, false),
    ANNOTATION_PROPERTY         ("AnnotationProperty",        true,  true,  false, false, false),
    SOME                        ("some",                      false, false, false, true,  false, "some"),
    ONLY                        ("only",                      false, false, false, true,  false, "only"),
    ONLYSOME                    ("onlysome",                  false, false, false, true,  false, "onlysome"),
    MIN                         ("min",                       false, false, false, true,  false, "min"),
    MAX                         ("max",                       false, false, false, true,  false, "max"),
    EXACTLY                     ("exactly",                   false, false, false, true,  false, "exactly"),
    VALUE                       ("value",                     false, false, false, true,  false, "value"),
    AND                         ("and",                       false, false, false, false, true,  "and"),
    OR                          ("or",                        false, false, false, false, true,  "or"),
    NOT                         ("not",                       false, false, false, false, true,  "not"),
    INVERSE                     ("inverse",                   false, false, true,  false, false, "inverse"),
    INV                         ("inv",                       false, false, true,  false, false, "inv"),
    SELF                        ("Self",                      false, false, false, true,  false, "Self"),
    THAT                        ("that",                      false, false, false, false, true, "that"),
    FACET_RESTRICTION_SEPARATOR (",",                         false, false, false, false, false),
    SUBCLASS_OF                 ("SubClassOf",                false, true,  true,  false, false),
    SUPERCLASS_OF               ("SuperClassOf",              false, true,  true,  false, false),
    EQUIVALENT_TO               ("EquivalentTo",              false, true,  true,  false, false),
    EQUIVALENT_CLASSES          ("EquivalentClasses",         false, true,  true,  false, false),
    EQUIVALENT_PROPERTIES       ("EquivalentProperties",      false, true,  true,  false, false),
    DISJOINT_WITH               ("DisjointWith",              false, true,  true,  false, false),
    INDIVIDUALS                 ("Individuals",               false, true,  true,  false, false),
    DISJOINT_CLASSES            ("DisjointClasses",           true,  true,  true,  false, false),
    DISJOINT_PROPERTIES         ("DisjointProperties",        true,  false, true,  false, false),
    DISJOINT_UNION_OF           ("DisjointUnionOf",           false, true,  true,  false, false),
    FACTS                       ("Facts",                     false, true,  false, false, false),
    SAME_AS                     ("SameAs",                    false, true,  true,  false, false),
    SAME_INDIVIDUAL             ("SameIndividual",            false, true,  true,  false, false),
    DIFFERENT_FROM              ("DifferentFrom",             false, true,  true,  false, false),
    DIFFERENT_INDIVIDUALS       ("DifferentIndividuals",      true,  true,  true,  false, false),
    MIN_INCLUSIVE_FACET         (">=",                        false, false, false, false, false),
    MAX_INCLUSIVE_FACET         ("<=",                        false, false, false, false, false),
    MIN_EXCLUSIVE_FACET         (">",                         false, false, false, false, false),
    MAX_EXCLUSIVE_FACET         ("<",                         false, false, false, false, false),
    ONE_OF_DELIMETER            (",",                         false, false, false, false, false),
    TYPES                       ("Types",                     false, true,  true,  false, false),
    TYPE                        ("Type",                      false, true,  true,  false, false),
    ANNOTATIONS                 ("Annotations",               false, true,  false, false, false),
    COMMA                       (",",                         false, false, false, false, false, ","),
    DOMAIN                      ("Domain",                    false, true,  true,  false, false),
    RANGE                       ("Range",                     false, true,  true,  false, false),
    CHARACTERISTICS             ("Characteristics",           false, true,  false, false, false),
    FUNCTIONAL                  ("Functional",                false, false, true,  false, false, "Functional"),
    INVERSE_FUNCTIONAL          ("InverseFunctional",         false, false, true,  false, false, "InverseFunctional"),
    SYMMETRIC                   ("Symmetric",                 false, false, true,  false, false, "Symmetric"),
    TRANSITIVE                  ("Transitive",                false, false, true,  false, false, "Transitive"),
    REFLEXIVE                   ("Reflexive",                 false, false, true,  false, false, "Reflexive"),
    IRREFLEXIVE                 ("Irreflexive",               false, false, true,  false, false, "Irreflexive"),
    LITERAL_TRUE                ("true",                      false, false, false, false, false, "true"),
    LITERAL_FALSE               ("false",                     false, false, false, false, false, "false"),
    LITERAL_INTEGER             ("$integer$",                 false, false, false, false, false, "$integer$"),
    LITERAL_FLOAT               ("$float$",                   false, false, false, false, false, "$float$"),
    LITERAL_DOUBLE              ("$double$",                  false, false, false, false, false, "$double$"),
    LITERAL_LITERAL             ("\"$Literal$\"",             false, false, false, false, false, "\"$Literal$\""),
    LITERAL_LIT_DATATYPE        ("\"$Literal$\"^^<datatype>", false, false, false, false, false, "\"$Literal$\"^^<datatype>"),
    LITERAL_LIT_LANG            ("\"$Literal$\"@<lang>",      false, false, false, false, false, "\"$Literal$\"@<lang>"),
    /** For legacy reasons. */                                 
    ANTI_SYMMETRIC              ("AntiSymmetric",             false, false, true,  false, false, "AntiSymmetric"),
    ASYMMETRIC                  ("Asymmetric",                false, false, true,  false, false, "Asymmetric"),
    INVERSE_OF                  ("InverseOf",                 false, true,  true,  false, false),
    INVERSES                    ("Inverses",                  false, true,  false, false, false),
    SUB_PROPERTY_OF             ("SubPropertyOf",             false, true,  true,  false, false),
    SUPER_PROPERTY_OF           ("SuperPropertyOf",           false, true,  true,  false, false),
    SUB_PROPERTY_CHAIN          ("SubPropertyChain",          false, true,  true,  false, false),
    HAS_KEY                     ("HasKey",                    false, true,  false, false, false),
    RULE                        ("Rule",                      true,  true,  false, false, false);

    //@formatter:on
    private boolean frameKeyword;
    private boolean sectionKeyword;
    private boolean axiomKeyword;
    private boolean classExpressionQuantiferKeyword;
    private boolean classExpressionConnectiveKeyword;
    private String rendering;
    private String keyword;

    private ManchesterOWLSyntax(String rendering, boolean frameKeyword,
            boolean sectionKeyword, boolean axiomKeyword,
            boolean classExpressionQuantifierKeyword,
            boolean classExpressionConnectiveKeyword, String keyword) {
        this.rendering = rendering;
        this.frameKeyword = frameKeyword;
        this.sectionKeyword = sectionKeyword;
        this.axiomKeyword = axiomKeyword;
        this.classExpressionConnectiveKeyword = classExpressionConnectiveKeyword;
        classExpressionQuantiferKeyword = classExpressionQuantifierKeyword;
        this.keyword = keyword;
    }

    private ManchesterOWLSyntax(String rendering, boolean frameKeyword,
            boolean sectionKeyword, boolean axiomKeyword,
            boolean classExpressionQuantifierKeyword,
            boolean classExpressionConnectiveKeyword) {
        this(rendering, frameKeyword, sectionKeyword, axiomKeyword,
                classExpressionQuantifierKeyword, classExpressionConnectiveKeyword,
                rendering + ":");
    }

    public boolean isFrameKeyword() {
        return frameKeyword;
    }

    public boolean isSectionKeyword() {
        return sectionKeyword;
    }

    public boolean isAxiomKeyword() {
        return axiomKeyword;
    }

    public boolean isClassExpressionConnectiveKeyword() {
        return classExpressionConnectiveKeyword;
    }

    public boolean isClassExpressionQuantiferKeyword() {
        return classExpressionQuantiferKeyword;
    }

    @Override
    public String toString() {
        return rendering;
    }

    public String keyword() {
        return keyword;
    }

    public boolean matches(String s) {
        return keyword.equalsIgnoreCase(s);
    }

    public boolean matchesEitherForm(String s) {
        return keyword.equalsIgnoreCase(s) || rendering.equalsIgnoreCase(s);
    }

    /** for keywords which match two tokens. */
    public boolean matches(String s, String v) {
        return rendering.length() == s.length() + v.length() && rendering.startsWith(s)
                && rendering.endsWith(v);
    }

    public static ManchesterOWLSyntax parse(String rendering) {
        for (ManchesterOWLSyntax m : values()) {
            if (m.matches(rendering)) {
                return m;
            }
        }
        return null;
    }
}
