CheckoutApi api = CheckoutApiImpl.create(sk_XXXX, true, pk_XXXX);

EventResponse event = api.eventsClient().retrieveEvent("evt_c2qelfixai2u3es3ksovngkx3e").get();