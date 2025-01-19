// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_set_serializer.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver15;

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
import org.projectfloodlight.openflow.protocol.OFBsnUdfMode;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import java.util.EnumSet;
import java.util.Collections;


public class OFBsnUdfModeSerializerVer15 {

    public final static byte BSN_UDF_8X2_BYTES_VAL = (byte) 0x1;
    public final static byte BSN_UDF_6X2_BYTES_VAL = (byte) 0x2;

    public static Set<OFBsnUdfMode> readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readByte());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, Set<OFBsnUdfMode> set) {
        bb.writeByte(toWireValue(set));
    }

    public static void putTo(Set<OFBsnUdfMode> set, PrimitiveSink sink) {
        sink.putByte(toWireValue(set));
    }


    public static Set<OFBsnUdfMode> ofWireValue(byte val) {
        EnumSet<OFBsnUdfMode> set = EnumSet.noneOf(OFBsnUdfMode.class);

        if((val & BSN_UDF_8X2_BYTES_VAL) != 0)
            set.add(OFBsnUdfMode.BSN_UDF_8X2_BYTES);
        if((val & BSN_UDF_6X2_BYTES_VAL) != 0)
            set.add(OFBsnUdfMode.BSN_UDF_6X2_BYTES);
        return Collections.unmodifiableSet(set);
    }

    public static byte toWireValue(Set<OFBsnUdfMode> set) {
        byte wireValue = 0;

        for(OFBsnUdfMode e: set) {
            switch(e) {
                case BSN_UDF_8X2_BYTES:
                    wireValue |= BSN_UDF_8X2_BYTES_VAL;
                    break;
                case BSN_UDF_6X2_BYTES:
                    wireValue |= BSN_UDF_6X2_BYTES_VAL;
                    break;
                default:
                    throw new IllegalArgumentException("Illegal enum value for type OFBsnUdfMode in version 1.5: " + e);
            }
        }
        return wireValue;
    }

}
