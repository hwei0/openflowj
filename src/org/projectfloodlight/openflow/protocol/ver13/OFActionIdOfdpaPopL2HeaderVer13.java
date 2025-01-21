// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package org.projectfloodlight.openflow.protocol.ver13;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFActionIdOfdpaPopL2HeaderVer13 implements OFActionIdOfdpaPopL2Header {
    private static final Logger logger = LoggerFactory.getLogger(OFActionIdOfdpaPopL2HeaderVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 10;


    // OF message fields
//
    // Immutable default instance
    final static OFActionIdOfdpaPopL2HeaderVer13 DEFAULT = new OFActionIdOfdpaPopL2HeaderVer13(

    );

    final static OFActionIdOfdpaPopL2HeaderVer13 INSTANCE = new OFActionIdOfdpaPopL2HeaderVer13();
    // private empty constructor - use shared instance!
    private OFActionIdOfdpaPopL2HeaderVer13() {
    }

    // Accessors for OF message fields
    @Override
    public OFActionType getType() {
        return OFActionType.EXPERIMENTER;
    }

    @Override
    public long getExperimenter() {
        return 0x1018L;
    }

    @Override
    public int getExpType() {
        return 0x2;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    // no data members - do not support builder
    public OFActionIdOfdpaPopL2Header.Builder createBuilder() {
        throw new UnsupportedOperationException("OFActionIdOfdpaPopL2HeaderVer13 has no mutable properties -- builder unneeded");
    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFActionIdOfdpaPopL2Header> {
        @Override
        public OFActionIdOfdpaPopL2Header readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 65535
            short type = bb.readShort();
            if(type != (short) 0xffff)
                throw new OFParseError("Wrong type: Expected=OFActionType.EXPERIMENTER(65535), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 10)
                throw new OFParseError("Wrong length: Expected=10(10), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            // fixed value property experimenter == 0x1018L
            int experimenter = bb.readInt();
            if(experimenter != 0x1018)
                throw new OFParseError("Wrong experimenter: Expected=0x1018L(0x1018L), got="+experimenter);
            // fixed value property expType == 0x2
            short expType = bb.readShort();
            if(expType != (short) 0x2)
                throw new OFParseError("Wrong expType: Expected=0x2(0x2), got="+expType);

            if(logger.isTraceEnabled())
                logger.trace("readFrom - returning shared instance={}", INSTANCE);
            return INSTANCE;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionIdOfdpaPopL2HeaderVer13Funnel FUNNEL = new OFActionIdOfdpaPopL2HeaderVer13Funnel();
    static class OFActionIdOfdpaPopL2HeaderVer13Funnel implements Funnel<OFActionIdOfdpaPopL2HeaderVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionIdOfdpaPopL2HeaderVer13 message, PrimitiveSink sink) {
            // fixed value property type = 65535
            sink.putShort((short) 0xffff);
            // fixed value property length = 10
            sink.putShort((short) 0xa);
            // fixed value property experimenter = 0x1018L
            sink.putInt(0x1018);
            // fixed value property expType = 0x2
            sink.putShort((short) 0x2);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionIdOfdpaPopL2HeaderVer13> {
        @Override
        public void write(ByteBuf bb, OFActionIdOfdpaPopL2HeaderVer13 message) {
            // fixed value property type = 65535
            bb.writeShort((short) 0xffff);
            // fixed value property length = 10
            bb.writeShort((short) 0xa);
            // fixed value property experimenter = 0x1018L
            bb.writeInt(0x1018);
            // fixed value property expType = 0x2
            bb.writeShort((short) 0x2);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionIdOfdpaPopL2HeaderVer13(");
        b.append(")");
        return b.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;

        return result;
    }

}
