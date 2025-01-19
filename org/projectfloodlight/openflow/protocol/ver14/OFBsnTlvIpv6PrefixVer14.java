// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;

class OFBsnTlvIpv6PrefixVer14 implements OFBsnTlvIpv6Prefix {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvIpv6PrefixVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 21;

        private final static IPv6Address DEFAULT_VALUE = IPv6Address.NONE;
        private final static short DEFAULT_PREFIX_LENGTH = (short) 0x0;

    // OF message fields
    private final IPv6Address value;
    private final short prefixLength;
//
    // Immutable default instance
    final static OFBsnTlvIpv6PrefixVer14 DEFAULT = new OFBsnTlvIpv6PrefixVer14(
        DEFAULT_VALUE, DEFAULT_PREFIX_LENGTH
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnTlvIpv6PrefixVer14(IPv6Address value, short prefixLength) {
        if(value == null) {
            throw new NullPointerException("OFBsnTlvIpv6PrefixVer14: property value cannot be null");
        }
        this.value = value;
        this.prefixLength = U8.normalize(prefixLength);
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x7a;
    }

    @Override
    public IPv6Address getValue() {
        return value;
    }

    @Override
    public short getPrefixLength() {
        return prefixLength;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFBsnTlvIpv6Prefix.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTlvIpv6Prefix.Builder {
        final OFBsnTlvIpv6PrefixVer14 parentMessage;

        // OF message fields
        private boolean valueSet;
        private IPv6Address value;
        private boolean prefixLengthSet;
        private short prefixLength;

        BuilderWithParent(OFBsnTlvIpv6PrefixVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x7a;
    }

    @Override
    public IPv6Address getValue() {
        return value;
    }

    @Override
    public OFBsnTlvIpv6Prefix.Builder setValue(IPv6Address value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public short getPrefixLength() {
        return prefixLength;
    }

    @Override
    public OFBsnTlvIpv6Prefix.Builder setPrefixLength(short prefixLength) {
        this.prefixLength = prefixLength;
        this.prefixLengthSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFBsnTlvIpv6Prefix build() {
                IPv6Address value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");
                short prefixLength = this.prefixLengthSet ? this.prefixLength : parentMessage.prefixLength;

                //
                return new OFBsnTlvIpv6PrefixVer14(
                    value,
                    prefixLength
                );
        }

    }

    static class Builder implements OFBsnTlvIpv6Prefix.Builder {
        // OF message fields
        private boolean valueSet;
        private IPv6Address value;
        private boolean prefixLengthSet;
        private short prefixLength;

    @Override
    public int getType() {
        return 0x7a;
    }

    @Override
    public IPv6Address getValue() {
        return value;
    }

    @Override
    public OFBsnTlvIpv6Prefix.Builder setValue(IPv6Address value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public short getPrefixLength() {
        return prefixLength;
    }

    @Override
    public OFBsnTlvIpv6Prefix.Builder setPrefixLength(short prefixLength) {
        this.prefixLength = prefixLength;
        this.prefixLengthSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFBsnTlvIpv6Prefix build() {
            IPv6Address value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");
            short prefixLength = this.prefixLengthSet ? this.prefixLength : DEFAULT_PREFIX_LENGTH;


            return new OFBsnTlvIpv6PrefixVer14(
                    value,
                    prefixLength
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnTlvIpv6Prefix> {
        @Override
        public OFBsnTlvIpv6Prefix readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x7a
            short type = bb.readShort();
            if(type != (short) 0x7a)
                throw new OFParseError("Wrong type: Expected=0x7a(0x7a), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 21)
                throw new OFParseError("Wrong length: Expected=21(21), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            IPv6Address value = IPv6Address.read16Bytes(bb);
            short prefixLength = U8.f(bb.readByte());

            OFBsnTlvIpv6PrefixVer14 bsnTlvIpv6PrefixVer14 = new OFBsnTlvIpv6PrefixVer14(
                    value,
                      prefixLength
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTlvIpv6PrefixVer14);
            return bsnTlvIpv6PrefixVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvIpv6PrefixVer14Funnel FUNNEL = new OFBsnTlvIpv6PrefixVer14Funnel();
    static class OFBsnTlvIpv6PrefixVer14Funnel implements Funnel<OFBsnTlvIpv6PrefixVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvIpv6PrefixVer14 message, PrimitiveSink sink) {
            // fixed value property type = 0x7a
            sink.putShort((short) 0x7a);
            // fixed value property length = 21
            sink.putShort((short) 0x15);
            message.value.putTo(sink);
            sink.putShort(message.prefixLength);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvIpv6PrefixVer14> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvIpv6PrefixVer14 message) {
            // fixed value property type = 0x7a
            bb.writeShort((short) 0x7a);
            // fixed value property length = 21
            bb.writeShort((short) 0x15);
            message.value.write16Bytes(bb);
            bb.writeByte(U8.t(message.prefixLength));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvIpv6PrefixVer14(");
        b.append("value=").append(value);
        b.append(", ");
        b.append("prefixLength=").append(prefixLength);
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
        OFBsnTlvIpv6PrefixVer14 other = (OFBsnTlvIpv6PrefixVer14) obj;

        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        if( prefixLength != other.prefixLength)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((value == null) ? 0 : value.hashCode());
        result = prime * result + prefixLength;
        return result;
    }

}
