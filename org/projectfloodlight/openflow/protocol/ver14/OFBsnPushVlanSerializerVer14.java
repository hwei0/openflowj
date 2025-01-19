// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_set_serializer.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver14;

import org.projectfloodlight.openflow.protocol.*;
import org.projectfloodlight.openflow.protocol.action.*;
import org.projectfloodlight.openflow.protocol.actionid.*;
import org.projectfloodlight.openflow.protocol.bsntlv.*;
import org.projectfloodlight.openflow.protocol.errormsg.*;
import org.projectfloodlight.openflow.protocol.meterband.*;
import org.projectfloodlight.openflow.protocol.instruction.*;
import org.projectfloodlight.openflow.protocol.instructionid.*;
import org.projectfloodlight.openflow.protocol.match.*;
import org.projectfloodlight.openflow.protocol.stat.*;
import org.projectfloodlight.openflow.protocol.oxm.*;
import org.projectfloodlight.openflow.protocol.oxs.*;
import org.projectfloodlight.openflow.protocol.queueprop.*;
import org.projectfloodlight.openflow.types.*;
import org.projectfloodlight.openflow.util.*;
import org.projectfloodlight.openflow.exceptions.*;
import org.projectfloodlight.openflow.protocol.OFBsnPushVlan;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import java.util.EnumSet;
import java.util.Collections;


public class OFBsnPushVlanSerializerVer14 {

    public final static byte BSN_PUSH_VLAN_UNTAGGED_VAL = (byte) 0x1;
    public final static byte BSN_PUSH_VLAN_SINGLE_TAGGED_VAL = (byte) 0x2;
    public final static byte BSN_PUSH_VLAN_DOUBLE_TAGGED_VAL = (byte) 0x4;

    public static Set<OFBsnPushVlan> readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readByte());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, Set<OFBsnPushVlan> set) {
        bb.writeByte(toWireValue(set));
    }

    public static void putTo(Set<OFBsnPushVlan> set, PrimitiveSink sink) {
        sink.putByte(toWireValue(set));
    }


    public static Set<OFBsnPushVlan> ofWireValue(byte val) {
        EnumSet<OFBsnPushVlan> set = EnumSet.noneOf(OFBsnPushVlan.class);

        if((val & BSN_PUSH_VLAN_UNTAGGED_VAL) != 0)
            set.add(OFBsnPushVlan.BSN_PUSH_VLAN_UNTAGGED);
        if((val & BSN_PUSH_VLAN_SINGLE_TAGGED_VAL) != 0)
            set.add(OFBsnPushVlan.BSN_PUSH_VLAN_SINGLE_TAGGED);
        if((val & BSN_PUSH_VLAN_DOUBLE_TAGGED_VAL) != 0)
            set.add(OFBsnPushVlan.BSN_PUSH_VLAN_DOUBLE_TAGGED);
        return Collections.unmodifiableSet(set);
    }

    public static byte toWireValue(Set<OFBsnPushVlan> set) {
        byte wireValue = 0;

        for(OFBsnPushVlan e: set) {
            switch(e) {
                case BSN_PUSH_VLAN_UNTAGGED:
                    wireValue |= BSN_PUSH_VLAN_UNTAGGED_VAL;
                    break;
                case BSN_PUSH_VLAN_SINGLE_TAGGED:
                    wireValue |= BSN_PUSH_VLAN_SINGLE_TAGGED_VAL;
                    break;
                case BSN_PUSH_VLAN_DOUBLE_TAGGED:
                    wireValue |= BSN_PUSH_VLAN_DOUBLE_TAGGED_VAL;
                    break;
                default:
                    throw new IllegalArgumentException("Illegal enum value for type OFBsnPushVlan in version 1.4: " + e);
            }
        }
        return wireValue;
    }

}
