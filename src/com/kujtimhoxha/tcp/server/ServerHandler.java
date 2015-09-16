package com.kujtimhoxha.tcp.server;

import com.kujtimhoxha.tcp.Transaction;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * Created by Kujtim on 9/16/2015.
 */
public class ServerHandler  extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        System.out.println("--------New client registered----------");

        super.channelRegistered(ctx);
    }

    @Override
    public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
        super.channelUnregistered(ctx);
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        Transaction transaction= (Transaction) msg;
        System.out.println("--------Received a new message----------");
        System.out.println("The message : "+transaction.getMessage());
        System.out.println("The int value : "+transaction.getSomeIntValue());
        System.out.println("The double value : "+transaction.getSomeDoubleValue());
        super.channelRead(ctx, msg);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {

    }
}
