// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_serializer.java
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
import org.projectfloodlight.openflow.protocol.OFQueueDescPropType;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;

public class OFQueueDescPropTypeSerializerVer15 {

    public final static short MIN_RATE_VAL = (short) 0x1;
    public final static short MAX_RATE_VAL = (short) 0x2;
    public final static short EXPERIMENTER_VAL = (short) 0xffff;

    public static OFQueueDescPropType readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(U8.f(bb.readByte()));
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, OFQueueDescPropType e) {
        bb.writeByte(U8.t(toWireValue(e)));
    }

    public static void putTo(OFQueueDescPropType e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFQueueDescPropType ofWireValue(short val) {
        switch(val) {
            case MIN_RATE_VAL:
                return OFQueueDescPropType.MIN_RATE;
            case MAX_RATE_VAL:
                return OFQueueDescPropType.MAX_RATE;
            case EXPERIMENTER_VAL:
                return OFQueueDescPropType.EXPERIMENTER;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFQueueDescPropType in version 1.5: " + val);
        }
    }


    public static short toWireValue(OFQueueDescPropType e) {
        switch(e) {
            case MIN_RATE:
                return MIN_RATE_VAL;
            case MAX_RATE:
                return MAX_RATE_VAL;
            case EXPERIMENTER:
                return EXPERIMENTER_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFQueueDescPropType in version 1.5: " + e);
        }
    }

}
