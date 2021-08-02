ARG ASP_VERSION=5.0

FROM mcr.microsoft.com/dotnet/sdk:$ASP_VERSION AS asp-build-env

COPY StaticSite/ ./static_server
WORKDIR /static_server 
RUN dotnet publish -c Release


FROM mcr.microsoft.com/dotnet/aspnet:$ASP_VERSION

WORKDIR /static_server
COPY --from=asp-build-env static_server/bin/Release/net5.0/publish/ .

ENV ASPNETCORE_URLS=http://+:10100  
ENTRYPOINT ["dotnet", "/static_server/StaticSite.dll"]
