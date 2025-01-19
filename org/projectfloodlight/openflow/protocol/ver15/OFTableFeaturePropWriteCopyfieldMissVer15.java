// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import com.google.common.collect.ImmutableList;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFTableFeaturePropWriteCopyfieldMissVer15 implements OFTableFeaturePropWriteCopyfieldMiss {
    private static final Logger logger = LoggerFactory.getLogger(OFTableFeaturePropWriteCopyfieldMissVer15.class);
    // version: 1.5
    final static byte WIRE_VERSION = 6;
    final static int MINIMUM_LENGTH = 4;
    // maximum OF message length: 16 bit, unsigned
    final static int MAXIMUM_LENGTH = 0xFFFF;

        private final static List<U32> DEFAULT_OXM_IDS = ImmutableList.<U32>of();

    // OF message fields
    private final List<U32> oxmIds;
//
    // Immutable default instance
    final static OFTableFeaturePropWriteCopyfieldMissVer15 DEFAULT = new OFTableFeaturePropWriteCopyfieldMissVer15(
        DEFAULT_OXM_IDS
    );

    // package private constructor - used by readers, builders, and factory
    OFTableFeaturePropWriteCopyfieldMissVer15(List<U32> oxmIds) {
        if(oxmIds == null) {
            throw new NullPointerException("OFTableFeaturePropWriteCopyfieldMissVer15: property oxmIds cannot be null");
        }
        this.oxmIds = oxmIds;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x13;
    }

    @Override
    public List<U32> getOxmIds() {
        return oxmIds;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



    public OFTableFeaturePropWriteCopyfieldMiss.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFTableFeaturePropWriteCopyfieldMiss.Builder {
        final OFTableFeaturePropWriteCopyfieldMissVer15 parentMessage;

        // OF message fields
        private boolean oxmIdsSet;
        private List<U32> oxmIds;

        BuilderWithParent(OFTableFeaturePropWriteCopyfieldMissVer15 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x13;
    }

    @Override
    public List<U32> getOxmIds() {
        return oxmIds;
    }

    @Override
    public OFTableFeaturePropWriteCopyfieldMiss.Builder setOxmIds(List<U32> oxmIds) {
        this.oxmIds = oxmIds;
        this.oxmIdsSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }



        @Override
        public OFTableFeaturePropWriteCopyfieldMiss build() {
                List<U32> oxmIds = this.oxmIdsSet ? this.oxmIds : parentMessage.oxmIds;
                if(oxmIds == null)
                    throw new NullPointerException("Property oxmIds must not be null");

                //
                return new OFTableFeaturePropWriteCopyfieldMissVer15(
                    oxmIds
                );
        }

    }

    static class Builder implements OFTableFeaturePropWriteCopyfieldMiss.Builder {
        // OF message fields
        private boolean oxmIdsSet;
        private List<U32> oxmIds;

    @Override
    public int getType() {
        return 0x13;
    }

    @Override
    public List<U32> getOxmIds() {
        return oxmIds;
    }

    @Override
    public OFTableFeaturePropWriteCopyfieldMiss.Builder setOxmIds(List<U32> oxmIds) {
        this.oxmIds = oxmIds;
        this.oxmIdsSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_15;
    }

//
        @Override
        public OFTableFeaturePropWriteCopyfieldMiss build() {
            List<U32> oxmIds = this.oxmIdsSet ? this.oxmIds : DEFAULT_OXM_IDS;
            if(oxmIds == null)
                throw new NullPointerException("Property oxmIds must not be null");


            return new OFTableFeaturePropWriteCopyfieldMissVer15(
                    oxmIds
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFTableFeaturePropWriteCopyfieldMiss> {
        @Override
        public OFTableFeaturePropWriteCopyfieldMiss readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x13
            short type = bb.readShort();
            if(type != (short) 0x13)
                throw new OFParseError("Wrong type: Expected=0x13(0x13), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            List<U32> oxmIds = ChannelUtils.readList(bb, length - (bb.readerIndex() - start), U32.READER);

            OFTableFeaturePropWriteCopyfieldMissVer15 tableFeaturePropWriteCopyfieldMissVer15 = new OFTableFeaturePropWriteCopyfieldMissVer15(
                    oxmIds
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", tableFeaturePropWriteCopyfieldMissVer15);
            return tableFeaturePropWriteCopyfieldMissVer15;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFTableFeaturePropWriteCopyfieldMissVer15Funnel FUNNEL = new OFTableFeaturePropWriteCopyfieldMissVer15Funnel();
    static class OFTableFeaturePropWriteCopyfieldMissVer15Funnel implements Funnel<OFTableFeaturePropWriteCopyfieldMissVer15> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFTableFeaturePropWriteCopyfieldMissVer15 message, PrimitiveSink sink) {
            // fixed value property type = 0x13
            sink.putShort((short) 0x13);
            // FIXME: skip funnel of length
            FunnelUtils.putList(message.oxmIds, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFTableFeaturePropWriteCopyfieldMissVer15> {
        @Override
        public void write(ByteBuf bb, OFTableFeaturePropWriteCopyfieldMissVer15 message) {
            int startIndex = bb.writerIndex();
            // fixed value property type = 0x13
            bb.writeShort((short) 0x13);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            ChannelUtils.writeList(bb, message.oxmIds);

            // update length field
            int length = bb.writerIndex() - startIndex;
            if (length > MAXIMUM_LENGTH) {
                throw new IllegalArgumentException("OFTableFeaturePropWriteCopyfieldMissVer15: message length (" + length + ") exceeds maximum (0xFFFF)");
            }
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFTableFeaturePropWriteCopyfieldMissVer15(");
        b.append("oxmIds=").append(oxmIds);
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
        OFTableFeaturePropWriteCopyfieldMissVer15 other = (OFTableFeaturePropWriteCopyfieldMissVer15) obj;

        if (oxmIds == null) {
            if (other.oxmIds != null)
                return false;
        } else if (!oxmIds.equals(other.oxmIds))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((oxmIds == null) ? 0 : oxmIds.hashCode());
        return result;
    }

}
